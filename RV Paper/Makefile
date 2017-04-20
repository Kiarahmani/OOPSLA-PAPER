all:
	pdflatex -shell-escape syncope
	pdflatex -shell-escape syncope
	bibtex syncope
	bibtex syncope
	pdflatex -shell-escape syncope
	bibtex syncope
	pdflatex -shell-escape syncope

# Check style:
proof:
	echo "weasel words: "
	sh bin/weasel *.tex
	echo
	echo "passive voice: "
	sh bin/passive *.tex
	echo
	echo "duplicates: "
	perl bin/dups *.tex


haste:
	pdflatex -shell-escape syncope

clean:
	rm -f *.log *.aux *.bbl *.out *~
