ImageHoleFiller by Tal Kolker

ASSUMPTIONS about the assignment:
- Image where all values are -1 is an invalid input
- Empty image is an invalid input
- Weight function with 0 as epsilon in an invalid input
- Image with at least one boundary pixel is a valid input
- Input is given as a text file in this format:

	[[float, float, ... , float],
	[float, float, ... , float],
	.
	.
	.
	[float, float, ... , float],
	[float, float, ... , float]]

For example:
	[[0.9, -1, -1],
	[0.7, -1, 0.6],
	[0.4, -1, -1],
	[0.2, 0.1, -1]]
	
	or
	[[0.9f, -1f, -1f],
	[0.7f, -1f, 0.6f],
	[0.4f, -1f, -1f],
	[0.2f, 0.1f, -1f]]
	

USAGE:
 java -jar ImageHoleFiller.jar <image_file_path> <connectivity_type> <weight_function> <epsilon> <exponent>
	
	Parameters (must be in the specified order, all mandatory):
	1. image_file_path : Image file path
	2. connectivity_type : Pixel connectivity type
	3. weight_function : Weight function for fill algorithm (for "DefaultWeightFunction"/any other function name, default function will be used);
	4. epsilon : Epsilon for default weight function
	5. exponent : Exponent for weight function


TIME COMPLEXITY:
	(1) Weight function time complexity is O(1) (since Math.pow complexity is O(1))
	(2) Calculate the value of a single "hole" pixel time complexity is O(m), where m is the number of boundaries.
	(3) Calculate value of n "hole" pixels time complexity is O(n*m)

Each "hole" pixel can have from 0 to 8 boundary pixels as neighbours (in case of 4-connectivity from 0 to 4).
In the worst case each "hole" pixel will have 8 boundary neigbours, as a result m <= 8n = O(n)

The algorithm's time complexity is:
O(n*m) <= O(n*n) = O(n^2)