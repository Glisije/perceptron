public class PerceptronTest {

    public static void main(String[] args) {
        Perceptron perceptron = new Perceptron();

        double[][] inputs = Numbers.numbersList;
        int[] outputs = {0, 1, 0, 1, 0, 1, 0, 1, 0};

        perceptron.Train(inputs, outputs, 10);

        System.out.println(perceptron.Output((Numbers.one)));
        System.out.println(perceptron.Output((Numbers.two)));
        System.out.println(perceptron.Output((Numbers.three)));
        System.out.println(perceptron.Output((Numbers.four)));
        System.out.println(perceptron.Output((Numbers.five)));
        System.out.println(perceptron.Output((Numbers.six)));
        System.out.println(perceptron.Output((Numbers.seven)));
        System.out.println(perceptron.Output((Numbers.eight)));
        System.out.println(perceptron.Output((Numbers.nine)));

    }

}