class Calculator {
	constructor() {}

	methodAdd(a, b) {
		return a + b;
	}

	methodMultiply(a, b) {
		return a * b;
	}

	methodSubtraction(a, b) {
		return a - b;
	}

	methodDivision(a, b) {
		return a / b;
	}

	methodPow(a, b) {
		return Math.pow(a, b);
	}
}

module.exports = Calculator;
