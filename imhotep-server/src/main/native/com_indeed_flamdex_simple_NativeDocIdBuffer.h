/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_indeed_flamdex_simple_NativeDocIdBuffer */

#ifndef _Included_com_indeed_flamdex_simple_NativeDocIdBuffer
#define _Included_com_indeed_flamdex_simple_NativeDocIdBuffer
#ifdef __cplusplus
extern "C" {
#endif
#undef com_indeed_flamdex_simple_NativeDocIdBuffer_BUFFER_LENGTH
#define com_indeed_flamdex_simple_NativeDocIdBuffer_BUFFER_LENGTH 512L
/*
 * Class:     com_indeed_flamdex_simple_NativeDocIdBuffer
 * Method:    readInts
 * Signature: (JJI)J
 */
JNIEXPORT jlong JNICALL Java_com_indeed_flamdex_simple_NativeDocIdBuffer_readInts
  (JNIEnv *, jclass, jlong, jlong, jint);

/*
 * Class:     com_indeed_flamdex_simple_NativeDocIdBuffer
 * Method:    readIntsSingle
 * Signature: (JJI)J
 */
JNIEXPORT jlong JNICALL Java_com_indeed_flamdex_simple_NativeDocIdBuffer_readIntsSingle
  (JNIEnv *, jclass, jlong, jlong, jint);

/*
 * Class:     com_indeed_flamdex_simple_NativeDocIdBuffer
 * Method:    nativeInit
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_indeed_flamdex_simple_NativeDocIdBuffer_nativeInit
  (JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif
