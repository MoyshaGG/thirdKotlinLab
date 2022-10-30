package com.moyshagg.thirdlab

import kotlin.random.Random

object CatStorage {
    private val catImage = listOf(R.drawable.mem1,R.drawable.mem2,
        R.drawable.mem3,R.drawable.mem4,R.drawable.mem5,R.drawable.mem6,
        R.drawable.mem7,R.drawable.mem8, R.drawable.mem9,R.drawable.mem10,
        R.drawable.mem11, R.drawable.mem12)

    private val publicAvatar = listOf(R.drawable.catpub1,R.drawable.catpub2,
        R.drawable.catpub3,R.drawable.catpub4)

    private val publicName = listOf("FunnyCats","CoolCats","OnlyCats","CuteCats","TopCats")

    fun getRandomPost() : MutableList<CatsData>
    {
        return MutableList(300) {
            val comments = Random.nextInt(10,100)
            val hours = Random.nextInt(10,24)
            val minutes = Random.nextInt(10,60)
            val likes = Random.nextInt(100,1000)
            val  date = "Сьогодні в $hours:$minutes"
            val public = Random.nextInt(0,4)

            CatsData(
                catImage[Random.nextInt(0,12)],
                publicAvatar[public],
                publicName[public],
                date, comments.toString(), likes.toString())
        }
    }
}