# matrix multiplication function

import numpy as np

def matrix_mult(a, b):
    return np.dot(a, b)

if __name__ == '__main__':
    a = np.array([[1, 2], [3, 4]])
    b = np.array([[5, 6], [7, 8]])
    print(matrix_mult(a, b))