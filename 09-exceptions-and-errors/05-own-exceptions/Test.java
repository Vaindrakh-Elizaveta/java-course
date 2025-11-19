public class Test {
    public static void main(String[] args) {
        try {
            setAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Возраст не может быть отрицательным!");
        }
    }
}

