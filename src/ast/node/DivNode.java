package ast.node;

import ast.type.IntType;
import ast.type.Type;
import ast.type.TypeException;
import lib.FOOLlib;
import parser.FOOLParser;
import util.Environment;
import util.SemanticError;

import java.util.ArrayList;

public class DivNode extends Node {

    private INode left;
    private INode right;

    public DivNode(FOOLParser.TermContext ctx, INode l, INode r) {
        super(ctx);
        left = l;
        right = r;
    }

    @Override
    public ArrayList<SemanticError> checkSemantics(Environment env) {
        //create the result
        ArrayList<SemanticError> res = new ArrayList<SemanticError>();

        //check semantics in the left and in the right exp

        res.addAll(left.checkSemantics(env));
        res.addAll(right.checkSemantics(env));

        return res;
    }

    @Override
    public Type type() throws TypeException {
        if (!(FOOLlib.isSubtype(left.type(), new IntType()) &&
                FOOLlib.isSubtype(right.type(), new IntType()))) {
            throw new TypeException("Non integers in division", ctx);
        }
        return new IntType();
    }

    @Override
    public ArrayList<INode> getChilds() {
        ArrayList<INode> childs = new ArrayList<>();

        childs.add(left);
        childs.add(right);

        return childs;
    }

    @Override
    public String codeGeneration() {
        return left.codeGeneration() +
                right.codeGeneration() +
                "div\n";
    }

    @Override
    public String toString() {
        return "Div";
    }

}  