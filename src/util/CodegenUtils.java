package util;

import exception.RedeclaredClassException;
import exception.UndeclaredClassException;
import type.ClassType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CodegenUtils {

    public static HashMap<String, ClassType> classTable = new HashMap<String, ClassType>();
    private static int label = 0;
    private static int functionsLabelCount = 0;
    private static String functionsCode = "";
    private static HashMap<String, ArrayList<DispatchTableEntry>> dispatchTables = new HashMap<>();

    public static String freshLabel() {
        return "label" + (label++);
    }

    public static String freshFunLabel() {
        return "function" + (functionsLabelCount++);
    }

    public static String freshDispatchTableLabel(String classID) {
        return "class" + classID;
    }

    public static void insertFunctionsCode(String c) {
        functionsCode += "\n" + c; // aggiunge una linea vuota di separazione prima di funzione
    }

    public static String getFunctionsCode() {
        return functionsCode;
    }


    public static void addClassEntry( String classID, ClassType classT ) throws RedeclaredClassException {
        if( classTable.get( classID ) != null ) throw new RedeclaredClassException( classID );
        classTable.put( classID, classT );
    }

    public static ClassType getClassEntry( String classID ) throws UndeclaredClassException {
        ClassType classT = classTable.get( classID );
        if( classT == null ) throw new UndeclaredClassException( classID );
        return classTable.get( classID );
    }

    // TODO: gestione errori?
    public static void addDispatchTable(String classID, ArrayList<DispatchTableEntry> dt) {
        dispatchTables.put(classID, dt);
    }

    public static ArrayList<DispatchTableEntry> getDispatchTable(String classID) {
        return dispatchTables.get(classID);
    }

    public static String getDispatchTablePointer(String classID) {
        return "push " + freshDispatchTableLabel(classID);
    }

    public static String generateDispatchTablesCode() {
        StringBuilder dtCodes = new StringBuilder();
        // For every class
        for (Map.Entry<String, ArrayList<DispatchTableEntry>> dt : dispatchTables.entrySet()) {
            // Creates a DT label
            dtCodes.append(freshDispatchTableLabel(dt.getKey())).append(":\n");
            // For every entry in the DT
            for (DispatchTableEntry entry : dispatchTables.get(dt.getKey())) {
                dtCodes.append(entry.getMethodCode());
            }
        }
        return dtCodes.toString();
    }

    public static void reset() {
        label = 0;
        functionsLabelCount = 0;
        functionsCode = "";
        classTable = new HashMap<>();
        dispatchTables = new HashMap<>();
    }

}