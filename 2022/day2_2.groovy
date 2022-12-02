File file = new File("puzzle_day2_1")
def line, noOfLines = 0;
def list = new ArrayList<Integer>()
def total = 0
def myScore = 0
def winScore = 0

file.withReader { reader ->
    while ((line = reader.readLine()) != null) {
        def play = line.split(' ')
        def myPlay = play[1]
        switch (play[0]) {
            case "A": // ROCK
                switch (myPlay) {
                    case "X": // LOOSE
                        myScore = 3
                        winScore = 0
                        break
                    case "Y": // DRAW
                        myScore = 1
                        winScore = 3
                        break
                    case "Z": // WIN
                        myScore = 2
                        winScore = 6
                        break
                }
                break
            case "B": // PAPER
                switch (myPlay) {
                    case "X": // LOOSE
                        myScore = 1
                        winScore = 0
                        break
                    case "Y": // DRAW
                        myScore = 2
                        winScore = 3
                        break
                    case "Z": // WIN
                        myScore = 3
                        winScore = 6
                        break
                }
                break
            case "C": // SCISORS
                switch (myPlay) {
                    case "X": // LOOSE
                        myScore = 2
                        winScore = 0
                        break
                    case "Y": // DRAW
                        myScore = 3
                        winScore = 3
                        break
                    case "Z": // WIN
                        myScore = 1
                        winScore = 6
                        break
                }
                break
        }
        total += myScore + winScore
        noOfLines++
    }

}
println "Nbr lines ${noOfLines}"
println "result = ${ total }"
