public class Main {
    public static void main(String[] args) {
        int rublesStep = 20;                            // кол-во рублей,за которые начислят одну милю
        int ticketPrice = 9121;                         // Цена билета
        int milesAmount = ticketPrice / rublesStep;     // Количество начисленных миль
        System.out.print("Начислено: ");
        System.out.println(milesAmount + " миль");

    }
}
