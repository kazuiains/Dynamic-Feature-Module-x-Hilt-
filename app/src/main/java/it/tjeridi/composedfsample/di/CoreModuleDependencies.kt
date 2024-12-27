package it.tjeridi.composedfsample.di

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface CoreModuleDependencies {
    fun versionCode(): Int
}