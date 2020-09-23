import { WebPlugin } from '@capacitor/core';
import { DJIPlugin } from './definitions';

export class DJIWeb extends WebPlugin implements DJIPlugin {
  constructor() {
    super({
      name: 'DJI',
      platforms: ['web'],
    });
  }

  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}

const DJI = new DJIWeb();

export { DJI };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(DJI);
