import java.time.LocalDateTime;
import java.util.*;

enum ActionType {
    DEPOSIT,
    WITHDRAW,
    TRANSFER,
    LOGIN,
    FAILED_LOGIN
}

enum Status {
    SUCCESS,
    FAILED
}
class LogEntry {

    private static int counter = 1;

    private final int logId;
    private final String accountNumber;
    private final ActionType actionType;
    private final double amount;
    private final LocalDateTime timestamp;
    private final Status status;

    public LogEntry(String accountNumber, ActionType actionType,
                    double amount, Status status) {
        this.logId = counter++;
        this.accountNumber = accountNumber;
        this.actionType = actionType;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.status = status;
    }

    public int getLogId() { return logId; }
    public String getAccountNumber() { return accountNumber; }
    public ActionType getActionType() { return actionType; }
    public double getAmount() { return amount; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public Status getStatus() { return status; }

    @Override
    public String toString() {
        return "LogID: " + logId +
                " | Acc: " + accountNumber +
                " | Action: " + actionType +
                " | Amount: " + amount +
                " | Status: " + status +
                " | Time: " + timestamp;
    }
}

/* ================= INTERFACE ================= */

interface SuspiciousDetector {
    List<LogEntry> detect(List<LogEntry> logs);
}

/* ================= IMPLEMENTATION ================= */

class SuspiciousDetectorImpl implements SuspiciousDetector {

    @Override
    public List<LogEntry> detect(List<LogEntry> logs) {

        List<LogEntry> suspicious = new ArrayList<>();
        Map<String, List<LogEntry>> accountMap = new HashMap<>();

        for (LogEntry log : logs) {
            accountMap
                .computeIfAbsent(log.getAccountNumber(), k -> new ArrayList<>())
                .add(log);
        }

        for (List<LogEntry> accountLogs : accountMap.values()) {

            int size = accountLogs.size();

            for (int i = 0; i < size; i++) {

                LogEntry current = accountLogs.get(i);

                // Rule 1: Withdrawal > 50000
                if (current.getActionType() == ActionType.WITHDRAW &&
                        current.getAmount() > 50000) {
                    suspicious.add(current);
                }

                // Rule 2: More than 3 FAILED_LOGIN in last 5 logs
                int failedCount = 0;
                int start = Math.max(0, i - 4);

                for (int j = start; j <= i; j++) {
                    if (accountLogs.get(j).getActionType() == ActionType.FAILED_LOGIN) {
                        failedCount++;
                    }
                }

                if (failedCount > 3) {
                    suspicious.add(current);
                }
            }
        }

        return suspicious;
    }
}

/* ================= SERVICE CLASS ================= */

class LogManager {

    private final List<LogEntry> logs = new ArrayList<>();
    private final Map<String, List<LogEntry>> accountIndex = new HashMap<>();
    private final Map<ActionType, List<LogEntry>> actionIndex = new HashMap<>();

    public void addLog(String accountNumber, ActionType actionType,
                       double amount, Status status) {

        LogEntry log = new LogEntry(accountNumber, actionType, amount, status);

        logs.add(log);

        accountIndex
            .computeIfAbsent(accountNumber, k -> new ArrayList<>())
            .add(log);

        actionIndex
            .computeIfAbsent(actionType, k -> new ArrayList<>())
            .add(log);
    }

    public List<LogEntry> getLogsByAccount(String accountNumber) {
        return accountIndex.getOrDefault(accountNumber, new ArrayList<>());
    }

    public List<LogEntry> getRecentLogs(int n) {
        List<LogEntry> result = new ArrayList<>();
        int size = logs.size();

        for (int i = size - 1; i >= 0 && result.size() < n; i--) {
            result.add(logs.get(i));
        }

        return result;
    }

    public List<LogEntry> searchByAction(ActionType actionType) {
        return actionIndex.getOrDefault(actionType, new ArrayList<>());
    }

    public List<LogEntry> getAllLogs() {
        return logs;
    }
}

/* ================= DRIVER ================= */

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LogManager manager = new LogManager();
        SuspiciousDetector detector = new SuspiciousDetectorImpl();

        while (true) {

            System.out.println("\n===== Banking Log Manager =====");
            System.out.println("1. Add Log");
            System.out.println("2. Get Logs by Account");
            System.out.println("3. Get Recent Logs");
            System.out.println("4. Detect Suspicious Activity");
            System.out.println("5. Search by Action Type");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Account Number: ");
                    String acc = sc.next();

                    System.out.println("Action Type: ");
                    for (ActionType type : ActionType.values()) {
                        System.out.println(type);
                    }
                    ActionType action = ActionType.valueOf(sc.next());

                    double amount = 0;
                    if (action == ActionType.DEPOSIT ||
                        action == ActionType.WITHDRAW ||
                        action == ActionType.TRANSFER) {

                        System.out.print("Amount: ");
                        amount = sc.nextDouble();
                    }

                    System.out.println("Status (SUCCESS/FAILED): ");
                    Status status = Status.valueOf(sc.next());

                    manager.addLog(acc, action, amount, status);
                    System.out.println("Log Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String account = sc.next();
                    manager.getLogsByAccount(account)
                           .forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Enter N: ");
                    int n = sc.nextInt();
                    manager.getRecentLogs(n)
                           .forEach(System.out::println);
                    break;

                case 4:
                    detector.detect(manager.getAllLogs())
                            .forEach(System.out::println);
                    break;

                case 5:
                    System.out.println("Enter Action Type:");
                    ActionType at = ActionType.valueOf(sc.next());
                    manager.searchByAction(at)
                           .forEach(System.out::println);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
