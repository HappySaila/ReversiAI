# Makefile ReversiAI

SRCDIR = src
BINDIR = bin

JAVAC = javac
JFLAGS = -g -d $(BINDIR) -cp $(BINDIR):$(JUNIT)


vpath %.java $(SRCDIR)
vpath %.class $(BINDIR)

# define general build rule for java sources
.SUFFIXES:  .java  .class

.java.class:
	$(JAVAC)  $(JFLAGS)  $<

#default rule - will be invoked by make
all: Board.class Position.class Player.class Game.class\
	ReversiBoard.class ReversiPosition.class ReversiPlayer.class ReversiGame.class

clean:
	@rm -f $(BINDIR)/*.class
run: all
	java -cp $(BINDIR) ReversiGame

