exports.getResult = function(num) {
    var pattern = {
        3: 'fizz',
        5: 'buzz',
    }

    return Object.keys(pattern).reduce(function(p, k) {
        return p + (num % k === 0 ? pattern[k] : '')
    }, '') || num
}