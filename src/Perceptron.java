import java.util.Random;

public class Perceptron {

    double[] weights;
    public void Train(double[][] inputs, int[] outputs, int epoch)
    {

        int inputLayerSize = inputs[0].length;
        int outputLayerSize = outputs.length;
        weights = new double[inputLayerSize];
        Random rnd = new Random();

        for (int i = 0; i < inputLayerSize; i++) {
            weights[i] = rnd.nextDouble();
        }

        for (int i = 0; i < epoch; i++) {
            int totalError = 0;
            for (int j = 0; j < outputLayerSize; j++) {
                int output = Output(inputs[j]);
                int error = outputs[j] - output;

                totalError += error;

                for (int k = 0; k < inputLayerSize; k++) {
                    double delta = inputs[j][k] * error;
                    weights[k] += delta;
                }


            }
            if (totalError == 0)
                break;
        }

    }

    public int Output(double[] input)
    {
        double sum = 0.0;
        for(int i=0;i<input.length;i++)
        {
            sum += weights[i]*input[i];
        }

        if (sum > 0)
            return 1;
        else
            return 0;

    }

}