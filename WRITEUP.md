# Question 1

## Solution

For this question, the 'main problem' is being able to efficiently identify which meteor is the next closest to Earth. The meteors are fed to the WatchTower in an arbitrary order. In order to always be able to pick the next meteor, we use a priority queue. A priority queue has an `O(log n)` time complexity for adding elements and an `O(1)` time complexity for removing elements. It takes `O(n)` space.

## Implementation details

In order to implement our solution, we needed to create a `Meteor` class which represents a meteor and stores its distance from Earth. We also created a `WatchTower` class which has a `detectMeteor` method and a `destroy` method which destroys the closest Meteor. The `WatchTower` class has a `PriorityQueue` as an instance variable. In order to be able to use the `PriorityQueue` with our custom `Meteor` class, we needed to implement a `Comparator` which can compare two `Meteor`s. We did this using an anonymous inner class which implements the `Comparator` interface in-line in the `PriorityQueue` constructor call.

## Testing

We test the following cases:
* adding and destroying a meteor
* adding multiple meteors in order and ensuring they are destroyed in the correct order
* adding multiple meteors out of order and ensuring they are destroyed in the correct order

This covers all the possible configurations of Meteors we could receive. We also test adding a few meteors, removing a meteor, and then adding a few more, before removing the rest.