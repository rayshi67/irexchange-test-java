Consider the following children’s game:
             * n children stand around a circle.
             * Starting with a given child and working clockwise, each child gets a
               sequential number, which we will refer to as it’s id.
             * Then starting with the first child, they count out from 1 until k. The
               k’th child is now out and leaves the circle. The count starts again
               with the child immediately next to the eliminated one.
             * Children are so removed from the circle one by one. The winner is the
               child left standing last.

Write a method on a new class, which, when given n and k, returns the
sequence of children as they go out, and the id of the winning child. Create any
additional classes, tests, etc, you need to support the design of your solution.

Please document design decisions you have made i.e. general approach,
where and why you have sacrificed performance for maintainability or
visa versa etc.