package com.example.iubip_lectures.useacases

import com.example.iubip_lectures.data.domain.Status
import com.example.iubip_lectures.data.domain.Choice
import kotlin.random.Random

class Game {

    fun game(player: Choice): Status {
        val list = listOf(Choice.PAPER, Choice.ROCK, Choice.SCISSORS)
        val computerChoice = list[Random.nextInt(list.size)]

        if (player == Choice.PAPER) {
            return if (computerChoice == Choice.PAPER) {
                Status.DRAW
            } else if(computerChoice == Choice.SCISSORS) {
                Status.LOSE
            } else {
                Status.WIN
            }
        } else if (player == Choice.ROCK) {
            return if (computerChoice == Choice.PAPER) {
                Status.LOSE
            } else if(computerChoice == Choice.SCISSORS) {
                Status.WIN
            } else {
                Status.DRAW
            }
        } else {
            return if (computerChoice == Choice.PAPER) {
                Status.DRAW
            } else if(computerChoice == Choice.SCISSORS) {
                Status.LOSE
            } else {
                Status.WIN
            }
        }
    }


}