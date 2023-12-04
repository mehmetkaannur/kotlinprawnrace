package pawnrace

enum class Piece {
    B, W
}

class File(val file: Char)
class Rank(val rank: Int)
class Position(private val pos: String) {
    val column = File(pos[0].uppercaseChar())
    val row = Rank(pos[1].code)
    override fun toString(): String {
        return pos
    }
}

enum class MoveType {
    PEACEFUL, CAPTURE, EN_PASSANT
}

class Move(
    val piece: Piece,
    val from: Position,
    val to: Position,
    val type: MoveType,
) {
    override fun toString(): String {
        return "$from x $to"
    }
}

class Board(whiteGap: Rank, blackGap: Rank) {
    var board: Array<Array<Piece?>> = Array(8) { Array(8) { null } }
}
