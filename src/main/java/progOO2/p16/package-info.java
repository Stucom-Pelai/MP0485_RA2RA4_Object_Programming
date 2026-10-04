/**
 * <h2>Programming Object Oriented II: PaymentCard</h2>
 *
 * <p>
 * This package introduces object-oriented design with fields, constructors, methods with parameters,
 * and state updates. The {@code PaymentCard} class models a simple prepaid card
 * that can be used to pay for meals and reload balance with restrictions.
 * </p>
 *
 * <h3>Key learning goals:</h3>
 * <ul>
 *   <li><b>Encapsulation</b>: The {@code balance} field is private, ensuring controlled updates.</li>
 *   <li><b>Method parameters</b>: The {@code addMoney(double amount)} method shows how to validate
 *       and limit input to avoid invalid states.</li>
 *   <li><b>Conditional logic</b>: Methods {@code eatAffordably()} and {@code eatHeartily()} deduct only if balance allows.</li>
 *   <li><b>Constraints</b>: The balance cannot exceed 150 euros, demonstrating business rules in method implementation.</li>
 * </ul>
 *
 * <p>
 * This exercise helps students practice combining constructors, parameters, conditions,
 * and encapsulation to simulate real-world constraints in programming.
 * </p>
 *
 * <p>
 * <img src="../../../../resources/PaymentCardUML.png" alt="PaymentCard UML Diagram" width="300" height="300"/>
 * </p>
 */
package main.java.progOO2.p16;
