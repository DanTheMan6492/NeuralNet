import java.util.Random;

public class Dense_Layer {
	
	private int numInputs, numNeurons;
	private float[][] weights;
	private float[] biases;
	
	/**
	 * @param inputs: Number of inputs
	 * @param neurons: Number of neurons
	 */
	public Dense_Layer(int inputs, int neurons) {
		numInputs = inputs; numNeurons = neurons;
		weights = new float[neurons][inputs]; //flip neurons and inputs instead of transposing to save time
		Random rnd = new Random();
		//filling the weights with random numbers
		for(int i = 0; i < neurons; i++) 
			for(int j = 0; j < neurons; j++) 
				weights[i][j] = 0.01f * rnd.nextFloat(-1, 1);
		biases = new float[inputs];
	}
	
	/**
	 * Perform one forward pass of the layer
	 * @param input: the input to the layer
	 * @return output of the nuerons
	 */
	public float[][] forward(float[][] input) {
		float[][] output = new float[input.length][numInputs];
		return null;
	}
}
