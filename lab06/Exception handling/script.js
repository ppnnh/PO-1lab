try {
    console.log(a);
    let a=3;
}
catch (arror) {
    console.error('let must be declared');
}

try {
    let expression=1/0;
    if (expression==Infinity || expression==-Infinity){
        throw new ReferenceError('cannot be divided by zero');
    }
}
catch (error){
    console.error(error);
}