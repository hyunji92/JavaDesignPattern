public class Service {
    // �����ӥ��¹Գ���
    public static void service() {
        System.out.print("service");
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("done.");
    }

    // �����ӥ����
    public static void cancel() {
        // ̤����
    }
}