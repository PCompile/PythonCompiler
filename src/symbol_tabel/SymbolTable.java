package symbol_tabel;

import java.util.HashMap;
import java.util.Collection;

public class SymbolTable {

    // ================== Symbol Entry ==================
    public static class SymbolEntry {
        private String name;
        private HashMap<String, Object> attributes;

        public SymbolEntry(String name) {
            this.name = name;
            this.attributes = new HashMap<>();
        }

        public String getName() {
            return name;
        }

        public void setAttribute(String key, Object value) {
            attributes.put(key, value);
        }

        public Object getAttribute(String key) {
            return attributes.get(key);
        }

        public HashMap<String, Object> getAllAttributes() {
            return attributes;
        }
    }

    // ================== Symbol Table Core ==================
    private HashMap<String, SymbolEntry> table;

    public SymbolTable() {
        allocate();
    }

    // allocate: create empty table
    public void allocate() {
        table = new HashMap<>();
    }

    // free: clear table
    public void free() {
        table.clear();
    }

    // lookup: search for a symbol
    public SymbolEntry lookup(String name) {
        return table.get(name);
    }

    // insert: add new symbol
    public SymbolEntry insert(String name) {
        if (table.containsKey(name)) {
            System.out.println("Semantic Error: symbol '" + name + "' already defined.");
            return table.get(name);
        }
        SymbolEntry entry = new SymbolEntry(name);
        table.put(name, entry);
        return entry;
    }

    // set_attribute
    public void setAttribute(String name, String key, Object value) {
        SymbolEntry entry = lookup(name);
        if (entry == null) {
            System.out.println("Semantic Error: symbol '" + name + "' not defined.");
            return;
        }
        entry.setAttribute(key, value);
    }

    // get_attribute
    public Object getAttribute(String name, String key) {
        SymbolEntry entry = lookup(name);
        if (entry == null) {
            System.out.println("Semantic Error: symbol '" + name + "' not defined.");
            return null;
        }
        return entry.getAttribute(key);
    }

    // helper: get all symbols (for printing)
    public Collection<SymbolEntry> getAllSymbols() {
        return table.values();
    }

    // helper: print symbol table
    public void print() {
        System.out.println("\n===== Symbol Table =====");
        System.out.printf("%-12s %-15s %-10s\n", "Name", "Type", "Value");
        System.out.println("--------------------------------------");

        for (SymbolEntry entry : table.values()) {
            System.out.printf(
                    "%-12s %-15s %-10s\n",
                    entry.getName(),
                    entry.getAttribute("type"),
                    entry.getAttribute("value")
            );
        }
    }

}
