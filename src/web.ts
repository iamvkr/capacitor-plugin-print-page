import { WebPlugin } from '@capacitor/core';

import type { PrintpagePlugin } from './definitions';

export class PrintpageWeb extends WebPlugin implements PrintpagePlugin {
  async print(): Promise<{ status:boolean }> {
    window.print();
    return {status:true}
  }
}