"use strict";
// ModoStrict.js

//x = 10;
//console.log(x); // ReferenceError: x is not defined
// In strict mode, variables must be declared before use

const x = 10;
console.log(x); // 10


function miFuncion() {
    "use strict";
    let y = 10;
    console.log(y); // ReferenceError: Let is not defined
}

miFuncion();
// In strict mode, variables declared with let or const are block-scoped