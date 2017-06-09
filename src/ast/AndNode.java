package ast;

import lib.FOOLlib;
import util.Environment;
import util.SemanticError;

import java.util.ArrayList;

public class AndNode implements Node {

    private Node left;
    private Node right;

    public AndNode(Node l, Node r) {
        left=l;
        right=r;
    }
  
    public String toPrint(String s) {
        return s+"And\n" + left.toPrint(s+"  ")
                + right.toPrint(s+"  ") ;
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
  
    public Type typeCheck() {
        Type l = left.typeCheck();
        Type r = right.typeCheck();
        if (! ( FOOLlib.isSubtype(l,r) || FOOLlib.isSubtype(r,l) )) {
            System.out.println("Incompatible types in equal");
            System.exit(0);
        }
        if(l.getClass() != ast.BoolType.class){
            System.out.println("Operator '&&' cannot be applied to 'int', 'int'");
            System.exit(0);
        }
        return new BoolType();
    }
  
    public String codeGeneration() {
        String l1 = FOOLlib.freshLabel();
	    String l2 = FOOLlib.freshLabel();
	    String l3 = FOOLlib.freshLabel();
	    return left.codeGeneration()+
                right.codeGeneration()+
                "beq " + l1 + "\n" +
                "push 0\n" +
                "b " + l2 + "\n" +
                l1 + ":\n" +
                left.codeGeneration() +
                "push 1\n" +
                "beq "+ l3 +"\n"+
			   "push 0\n"+
			   "b " + l2 + "\n" +
			   l3 + ":\n"+
			   "push 1\n" +
			   l2 + ":\n";
    }
  
}  