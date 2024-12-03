import { registerPlugin } from '@capacitor/core';

import type { PrintpagePlugin } from './definitions';

const Printpage = registerPlugin<PrintpagePlugin>('Printpage', {
  web: () => import('./web').then((m) => new m.PrintpageWeb()),
});

export * from './definitions';
export { Printpage };
