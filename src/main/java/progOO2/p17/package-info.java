/**
 * <h2>Programming Object Oriented II: Items</h2>
 *
 * <p>
 * This package introduces objects that store both data and metadata 
 * (such as creation time) and demonstrates how collections of such objects 
 * can be managed through user input.
 * </p>
 *
 * <h3>Classes:</h3>
 * <ul>
 *   <li><b>{@code Item}</b>: Represents a single item with a {@code name} and 
 *   a timestamp {@code createdAt}. Its {@code toString()} method displays the 
 *   name and formatted creation date.</li>
 *   <li><b>{@code Items}</b>: A program with a {@code main} method that asks 
 *   the user for item names, creates {@code Item} objects, stores them in a 
 *   list, and prints their details. Input stops when the user enters an empty 
 *   string.</li> 
 * </ul>
 *
 * <h3>Key learning goals:</h3>
 * <ul>
 *   <li><b>Encapsulation</b>: Fields remain private, with access through 
 *   methods like {@code getName()} and {@code toString()}.</li>
 *   <li><b>Timestamps</b>: Use of {@link java.time.LocalDateTime} and 
 *   {@link java.time.format.DateTimeFormatter} to record creation time.</li>
 *   <li><b>Collections</b>: Managing multiple objects in an 
 *   {@link java.util.ArrayList}.</li>
 *   <li><b>User interaction</b>: Reading input with {@link java.util.Scanner} 
 *   and stopping on an empty line.</li>
 * </ul>
 *
 * <p>
 * Together, these classes help students practice building both simple data 
 * models and more complex object-collection interactions 
 * (like {@code Item} and {@code Items}).
 * </p>
 *
 * <p>
 * <img src="../../../../resources/ItemsUML.png" alt="Items UML Diagram" width="400" height="300"/>
 * </p>
 */
package main.java.progOO2.p17;
