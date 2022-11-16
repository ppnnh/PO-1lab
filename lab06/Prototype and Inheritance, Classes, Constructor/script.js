class animal{
    constructor(type){
        this.type=type,
        this.moving=true;
    }
}

class cat extends animal{
    constructor(type, moving){
        super(type, moving);
        this.type="cat";
    }
}

let dog=new animal("dog");
let movingCat=new cat();

console.log(dog);
console.log(movingCat);