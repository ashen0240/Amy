# Directory where .class files will be saved
OUT_DIR = bin

# Java source files
SRC_FILES = $(wildcard *.java)

# The name of the main class (replace with your main class name)
MAIN_CLASS = Main

# Target to compile your Java code and save .class files in a specific directory
compile: $(SRC_FILES)
	@echo "Compiling Java files..."
	mkdir -p $(OUT_DIR)
	javac -d $(OUT_DIR) $(SRC_FILES)
	@echo "Compilation complete."

# Target to clean up all .class files, but only if OUT_DIR exists
clean:
	@if [ -d $(OUT_DIR) ]; then \
		echo "Removing all .class files and bin directory..."; \
		find $(OUT_DIR) -name "*.class" -type f -delete; \
		rmdir $(OUT_DIR); \
		echo "Clean complete."; \
	else \
		echo "No $(OUT_DIR) directory found. Nothing to clean."; \
	fi

# Target to run the compiled Java program
run: compile
	@echo "Running the program..."
	java -cp $(OUT_DIR) $(MAIN_CLASS)
	@echo "Program finished."
