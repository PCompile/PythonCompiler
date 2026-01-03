package symbol_tabel;

import java.util.*;

public class SymbolTable {

    // ================== Symbol Entry ==================
    public static class SymbolEntry {
        private final String name;
        private final HashMap<String, Object> attributes;

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
            return new HashMap<>(attributes); 
        }
    }

    // ================== Symbol Table Core ==================
    private LinkedHashMap<String, SymbolEntry> table;

    public SymbolTable() {
        allocate();
    }

    // allocate: create empty table
    public void allocate() {
        table = new LinkedHashMap<>();
    }

    // free: clear table
    public void free() {
        if (table != null) {
            table.clear();
        }
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
        System.out.printf("%-15s %-15s %-40s\n", "Name", "Type", "Attributes");
        System.out.println("--------------------------------------------------------------------------");

        List<SymbolEntry> entries = new ArrayList<>(table.values());

        entries.sort((a, b) -> {
            Object la = a.getAttribute("line");
            Object lb = b.getAttribute("line");

            int lineA = la instanceof Integer ? (Integer) la : Integer.MAX_VALUE;
            int lineB = lb instanceof Integer ? (Integer) lb : Integer.MAX_VALUE;

            return Integer.compare(lineA, lineB);
        });

        for (SymbolEntry entry : entries) {
            String type = entry.getAttribute("type") != null ? entry.getAttribute("type").toString() : "";

            HashMap<String, Object> attrs = entry.getAllAttributes();
            attrs.remove("type");
            StringBuilder attrString = new StringBuilder();
            for (String key : attrs.keySet()) {
                attrString.append(key).append("=").append(attrs.get(key)).append(", ");
            }

            if (attrString.length() > 2) {
                attrString.setLength(attrString.length() - 2);
            }

            System.out.printf("%-15s %-15s %-40s\n",
                    entry.getName(),
                    type,
                    attrString.toString());
        }
    }


}
