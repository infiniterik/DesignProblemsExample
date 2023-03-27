# Question 1

For this question, the 'main problem' is being able to efficiently identify which meteor is the next closest to Earth. The meteors are fed to the WatchTower in an arbitrary order. In order to always be able to pick the next meteor, we use a priority queue. A priority queue has an `O(log n)` time complexity for adding elements and an `O(1)` time complexity for removing elements. It takes `O(n)` space.

