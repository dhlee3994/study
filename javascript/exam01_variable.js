const c1 = 0;
// c1 = 1; // Uncaught TypeError : Assignment to constant variable.

let l = 0;
l = 1;

const c2 = {name:"dhlee", age:27};
c2.name // "dhlee"
c2.age  // 27

const c3 = c2; 
c3.name = "abc"
c3.age = 200;

c2.name // "abc"
c3.age  // 200