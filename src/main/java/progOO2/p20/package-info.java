/**
 * <h2>Programming Object Oriented II: Library</h2>
 *
 * <p>
 * This package demonstrates how to create objects, store them in an
 * {@code ArrayList}, and display information about those objects based on
 * user input. The exercise uses books as the main example.
 * </p>
 *
 * <h3>Classes:</h3>
 * <ul>
 *   <li>{@link main.java.progOO2.p20.Book} represents a book with a title,
 *       number of pages, and publication year. It provides a getter for the
 *       book title and overrides {@code toString()} to display all book
 *       information.</li>
 *
 *   <li>{@link main.java.progOO2.p20.Library} contains the
 *       <code>main</code> method. It reads book information from the user,
 *       stores the books in an {@code ArrayList}, and allows the user to
 *       choose whether to display all information or only the book names.</li>
 * </ul>
 *
 * <h3>Key learning goals:</h3>
 * <ul>
 *   <li><b>Classes and objects</b>: Creating {@code Book} objects from
 *       information entered by the user.</li>
 *   <li><b>Collections</b>: Managing multiple {@code Book} objects inside
 *       an {@code ArrayList}.</li>
 *   <li><b>User input</b>: Reading and processing book information using
 *       {@code Scanner}.</li>
 *   <li><b>Conditional logic</b>: Selecting the information to display based
 *       on the user's choice.</li>
 *   <li><b>Encapsulation</b>: Keeping book attributes private and providing
 *       a getter for the book name.</li>
 *   <li><b>Object representation</b>: Using {@code toString()} to provide
 *       a readable representation of a {@code Book} object.</li>
 * </ul>
 *
 * <p>
 * This exercise strengthens the ability to combine classes, objects,
 * collections, user input, and conditional statements in a small
 * interactive Java application.
 * </p>
 *
 * <p>
 * <img src="../../../../resources/BookUML.png"
 *      alt="Book UML Diagram" width="400" height="300"/>
 * </p>
 */
package main.java.progOO2.p20;