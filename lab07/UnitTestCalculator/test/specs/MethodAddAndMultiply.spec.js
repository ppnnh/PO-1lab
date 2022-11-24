const Calculator = require('../../app/Calculator');
const { expect } = require('chai');

describe('Methods in calculator', function () {
	let calc;
	beforeEach(() => {
		calc = new Calculator();
	});

	afterEach(() => {
		calc = null;
	});

	it('Should return 9 when called with numbers 2 and 7', function () {
		expect(calc.methodAdd(2, 7)).to.be.equal(9);
	});

	it('Should return 10.6 when called with numbers 5.2 and 5.4', function () {
		expect(calc.methodAdd(5.2, 5.4)).to.be.equal(10.6);
	});

	it('Should return 40 when called with numbers 10 and 4', function () {
		expect(calc.methodMultiply(10, 4)).to.be.equal(40);
	});

	it('Should return 30 when called with numbers 6 and 5', function () {
		expect(calc.methodMultiply(6, 5)).to.be.equal(30);
	});

	it('Should return 40 when called with numbers 43.3 and 3.3', function () {
		expect(calc.methodSubtraction(43.3, 3.3)).to.be.equal(40);
	});

	it('Should return 28 when called with numbers 35 and 7', function () {
		expect(calc.methodSubtraction(35, 7)).to.be.equal(28);
	});

	it('Should return 6 when called with numbers 36 and 6', function () {
		expect(calc.methodDivision(36, 6)).to.be.equal(6);
	});

	it('Should return 4 when called with numbers 24 and 6', function () {
		expect(calc.methodDivision(24, 6)).to.be.equal(4);
	});

	it('Should return 9 when called with number 3 in degree 2', function () {
		expect(calc.methodPow(3, 2)).to.be.equal(9);
	});
});
