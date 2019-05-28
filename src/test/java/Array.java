public class Array {
    public static void main(String[] args) {
        int[] randomNumbers = generateRandomNumbers();
        printNumbers(randomNumbers);

        cycleresults1 (randomNumbers);

        cycleresults2 (randomNumbers);

    }

    private static int someNumbers() {
        return (int) (Math.random() * 201);

    }

    private static int[] generateRandomNumbers() {
        int[] randomNumbers = new int[someNumbers()];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = someNumbers();
        }
        return randomNumbers;
    }


    private static void printNumbers(int[] generatedNumbers) {
        System.out.println();
        System.out.println("Случайное число: ");
        for (int i : generatedNumbers) {
            System.out.print(i + " ");

        }
    }

        private static void cycleresults1 (int[] generatedNumbers) {
            for (int i = 0; i < generatedNumbers.length; i++) {
                if ((generatedNumbers[i] * 3) % 7 == 0) {
                    System.out.println("\nЧисло умноженое на 3 и нацело поделенное на 7 имеет квадрат: "
                            + (int) Math.pow(generatedNumbers[i], 2));
                    break;
                }
                else {
                    if ((generatedNumbers[i] % 3) == 1) {
                        System.out.println("\nОстаток деления случайного числа на 3 равен 1 и иммет индекс: " + i);
                    }
                }
            }
        }
        private static void cycleresults2 (int[] generatedNumbers){
            for (int i = 0; i < generatedNumbers.length; i++) {
                int cases = generatedNumbers[i] %17;
                switch(cases){
                    case 3 : System.out.println("Остаток деления на 17 который равен 3 это - " + generatedNumbers[i] + " его индекс: " +i);
                        break;
                    case 4 : System.out.println("Остаток деления на 17 который равен 4 это - " + generatedNumbers[i] + " его индекс: " +i);
                        break;
                    case 7 : System.out.println("Остаток деления на 17 который равен 7 это - " + generatedNumbers[i] + " его индекс: " +i);
                        break;
                    case 9 : System.out.println("Остаток деления на 17 который равен 3 это - " + generatedNumbers[i] + " его индекс: " +i);
                        break;
                    case 11 : System.out.println("Остаток деления на 17 который равен 3 это - " + generatedNumbers[i] + " его индекс: " +i);
                        break;
                    case 13 : System.out.println("Остаток деления на 17 который равен 3 это - " + generatedNumbers[i] + " его индекс: " +i);
                        break;

                        default:
                            break;
                }
            }
        }
    }

