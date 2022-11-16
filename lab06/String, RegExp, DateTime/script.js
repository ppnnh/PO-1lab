let string='ahb acb aeb aeeb adcb axeb';
let re=new RegExp('^a.*b$');
console.log(re.test(string));

string='2 + 3 223 2223';
re=new RegExp('/2\s\+\s3/');
console.log(string.match(re));

let date=new Date();
console.log(date.getDay());
console.log(date.getMonth());
console.log(date.getFullYear());