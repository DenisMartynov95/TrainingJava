package BigTask2;

public class Teacher extends Person implements Worker{

    String newCurrency = " Руб ";

    public Teacher() {
        // При создании объекта сразу устанавливаем валюту в "Руб "
        setCurrency(" Руб ");
    }

    @Override
    public void setCurrency(String currency) {
        super.setCurrency(newCurrency);
    }

    @Override
    public String getCurrency() {
        return super.getCurrency();
    }

    @Override
    public void work() {
        System.out.println("Я Учитель!");
    }

    @Override
    public String getSalary() {
        return "Моя зарплата: " + 65000 + getCurrency();
    }


}
