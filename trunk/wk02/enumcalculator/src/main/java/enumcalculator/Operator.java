package enumcalculator;

import java.util.function.IntBinaryOperator;

/**
 * Enum with operations. Example of how to use lambda expressions in an (enum)
 * constructor.
 *
 * @author Pieter van den Hombergh {@code <p.vandenhombergh@fontys.nl>}
 */
public enum Operator {
    ;

    //TODO 
    /**
     * Get the operator using its symbol. This method does a linear search
     * through the values of this enum.
     *
     * @param symbol to search
     * @return operation when found , null otherwise.
     */
    public static Operator get(String symbol) {
        //TODO 4 implement getOperator
        throw new UnsupportedOperationException("method not implemented");
    }

    /**
     * The operation is a IntBinaryOperator.
     *
     * {
     *
     * @see java.util.function.IntBinaryOperation}.
     */
    private final IntBinaryOperator operator;
    /**
     * The symbol that identifies the operation.
     */
    private final String symbol;

    /**
     * The constructor to create the Operation instances.
     *
     * @param symbol of this operator
     * @param operator the actual method
     */
    private Operator(String symbol, IntBinaryOperator operator) {
        this.symbol = symbol;
        this.operator = operator;
    }

    /**
     * Execute the calculation.
     *
     * @param a first param
     * @param b second param
     * @return result get the computation.
     */
    public int compute(int a, int b) {
        //TODO 5 implement compute
        return 0;
    }

    private String getSymbol() {
        return this.symbol;
    }
}
