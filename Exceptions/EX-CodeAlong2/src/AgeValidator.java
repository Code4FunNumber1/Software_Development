public class AgeValidator {

    public static void main(String[] args) {
        try {
            int testAge = 15;
            validateAge(testAge);
            System.out.printf("Age %s is valid%n", testAge);
        } catch (InvalidAgeException e) {
            System.out.printf("Validation Failed: %s%n",e.getMessage());
        } catch (Exception e) {
            System.out.printf("Exception Occurred: %s%n",e.getMessage());
        } finally {
            System.out.println("Finished Age Validation Attempt.");
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 130) {
            throw new InvalidAgeException("Age %s is not realistic.".formatted(age));
        }

        if (age < 18) {
            throw new InvalidAgeException("Age %s is too young.".formatted(age));
        }
    }
}
