package com.chata.app;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = ChataApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface ChataApplication_GeneratedInjector {
  void injectChataApplication(ChataApplication chataApplication);
}
