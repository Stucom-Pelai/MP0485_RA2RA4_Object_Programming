/**
 * <h2>Programming Object Oriented II: Agent</h2>
 *
 * <p>
 * This package introduces the concept of returning values from methods, specifically focusing on
 * generating a formatted string from an object's internal state.
 * The {@code Agent} class models a secret agent with a first name and a last name, and returns
 * a self-introduction string in a specific style.
 * </p>
 *
 * <h3>Key learning goals:</h3>
 * <ul>
 *   <li><b>Encapsulation</b>: The fields {@code firstName} and {@code lastName} are private, ensuring controlled access.</li>
 *   <li><b>String formatting</b>: The {@code toString()} method combines private fields into a well-defined output format.</li>
 *   <li><b>Constructor usage</b>: Demonstrates initializing object attributes through parameters.</li>
 * </ul>
 *
 * <p>
 * This exercise reinforces how to use constructors to set state and how to override the {@code toString()}
 * method to produce a meaningful text representation of an object.
 * </p>
 *
 * <p>
 * <img src="../../../../resources/AgentUML.png" alt="Agent UML Diagram" width="300" height="300"/>
 * </p>
 */
package main.java.progOO2.p13;
