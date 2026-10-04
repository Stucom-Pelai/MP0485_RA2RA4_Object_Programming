/**
 * <h2>Programming Object Oriented II: Program Collection</h2>
 *
 * <p>
 * This package demonstrates how to store objects in a list, filter them by attributes,
 * and display results based on user input. The exercise uses television programs as the 
 * main example.
 * </p>
 *
 * <h3>Classes:</h3>
 * <ul>
 *   <li>{@link main.java.progOO2.p19.TelevisionProgram} represents a TV program with
 *       a name and duration. It also includes a small utility method 
 *       {@code isAwesome()} that checks if the program name contains "MasterChef".</li>
 *   <li>{@link main.java.progOO2.p19.ProgramCollection} contains the 
 *       <code>main</code> method. It reads program data (name, duration) from the user, 
 *       stores them in an {@code ArrayList}, and prints only those whose duration is 
 *       within the user-specified maximum.</li>
 * </ul>
 *
 * <h3>Key learning goals:</h3>
 * <ul>
 *   <li><b>Collections</b>: Managing objects inside an {@code ArrayList}.</li>
 *   <li><b>User input</b>: Reading structured input to create objects.</li>
 *   <li><b>Filtering</b>: Printing only objects that satisfy a condition (max duration).</li>
 *   <li><b>Encapsulation</b>: Keeping fields private and providing getters.</li>
 *   <li><b>Utility methods</b>: Demonstrating extra behavior with {@code isAwesome()}.</li>
 * </ul>
 *
 * <p>
 * This exercise strengthens the ability to design data classes and use collections
 * to filter and process information interactively.
 * </p>
 *
 * <p>
 * <img src="../../../../resources/TelevisionProgramUML.png"
 *      alt="Program Collection UML Diagram" width="400" height="300"/>
 * </p>
 */
package main.java.progOO2.p19;
