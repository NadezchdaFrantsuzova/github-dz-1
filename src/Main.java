public class Main {

    public static void main(String[] args) {
        int[] sales = {20, 0, 190, 25, 191};
        SalesManager salesManager = new SalesManager(sales);

        System.out.println("Максимальный размер продаж: " + salesManager.max());
        System.out.println("Обрезанное среднее количество продаж: " + salesManager.medium(salesManager.max()));
    }
}

