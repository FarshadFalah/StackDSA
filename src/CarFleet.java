/***
 * <h1>Car Fleet</h1>
 * There are n cars traveling to the same destination on a one-lane highway.
 * <p>
 * You are given two arrays of Integers position and speed, both of length n.
 * <p>
 * position[i] is the position of the ith car (in miles)
 * speed[i] is the speed of the ith car (in miles per hour)
 * The destination is at position target miles.
 * <p>
 * A car cannot pass another car ahead of it. It can only catch up to another car and then drive at the same speed as the car ahead of it.
 * <p>
 * A car fleet is a non-empty set of cars driving at the same position and same speed. A single car is also considered a car fleet.
 * <p>
 * If a car catches up to a car fleet the moment the fleet reaches the destination, then the car is considered to be part of the fleet.
 * <p>
 * Return the number of different car fleets that will arrive at the destination.
 * <p>
 * Example 1:
 * <p>
 * Input: target = 10, position = [1,4], speed = [3,2]
 * <p>
 * Output: 1
 * <p>
 * Explanation: The cars starting at 1 (speed 3) and 4 (speed 2) become a fleet, meeting each other at 10, the destination.
 * <p>
 * Example 2:
 * <p>
 * Input: target = 10, position = [4,1,0,7], speed = [2,2,1,1]
 * <p>
 * Output: 3
 * <p>
 * Explanation: The cars starting at 4 and 7 become a fleet at position 10. The cars starting at 1 and 0 never catch up to the car ahead of them. Thus, there are 3 car fleets that will arrive at the destination.
 * <p>
 * Constraints:
 * <p>
 * n == position.length == speed.length.
 * <p>
 * 1 <= n <= 1000
 * <p>
 * 0 < target <= 1000
 * <p>
 * 0 < speed[i] <= 100
 * <p>
 * 0 <= position[i] < target
 * <p>
 * All the values of position are unique.
 */
public class CarFleet {
}
