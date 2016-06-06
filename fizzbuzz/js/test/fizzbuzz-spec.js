var assert = require('chai').assert
var fizzbuzz = require('../src/fizzbuzz')

describe('Fizz Buzz', function() {
    it('should return fizz if number is dividable by 3', function() {
        assert.equal('fizz', fizzbuzz.getResult(3))
        assert.equal('fizz', fizzbuzz.getResult(6))
        assert.equal('fizz', fizzbuzz.getResult(9))
    })

    it('should return buzz if number is dividable by 5', function() {
        assert.equal('buzz', fizzbuzz.getResult(5))
        assert.equal('buzz', fizzbuzz.getResult(10))
    })

    it('should return fizzbuzz if number is dividable by both 3 and 5', function() {
        assert.equal('fizzbuzz', fizzbuzz.getResult(15))
    })

    it('should return the same number for other cases', function() {
        assert.equal('1', fizzbuzz.getResult(1))
        assert.equal('2', fizzbuzz.getResult(2))
        assert.equal('4', fizzbuzz.getResult(4))
    })
})