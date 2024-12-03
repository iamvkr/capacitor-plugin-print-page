import { WebPlugin } from '@capacitor/core';

import type { PrintpagePlugin } from './definitions';

export class PrintpageWeb extends WebPlugin implements PrintpagePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
