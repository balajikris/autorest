/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

export class Lazy<T> implements PromiseLike<T> {
  private promise: Promise<T> | null = null;

  public constructor(private factory: () => Promise<T>) {
  }

  private get Value(): Promise<T> {
    if (this.promise === null) {
      this.promise = this.factory();
    }
    return this.promise;
  }

  then<TResult1, TResult2>(
    onfulfilled: (value: T) => TResult1 | PromiseLike<TResult1>,
    onrejected: (reason: any) => TResult2 | PromiseLike<TResult2>): PromiseLike<TResult1 | TResult2> {
    return this.Value.then(onfulfilled, onrejected);
  }
}