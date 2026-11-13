package com.example.activity6.view

import com.example.activity6.model.Siswa
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.activity6.R

@Composable
fun TampilSiswa(
    statusUiSiswa: Siswa,
    onBackButtonClicked: () -> Unit
){
    val items = listOf(
        Pair(stringResource(R.string.nama), statusUiSiswa.nama),
        Pair(stringResource(R.string.gender), statusUiSiswa.gender),
        Pair(stringResource(R.string.alamat), statusUiSiswa.alamat),
    )
}
